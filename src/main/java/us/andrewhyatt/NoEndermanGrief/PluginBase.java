package us.andrewhyatt.NoEndermanGrief;




import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginBase extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable(){
		getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onEntityChangeBlock(EntityChangeBlockEvent e) {
		if (e.getEntity().getType() == EntityType.ENDERMAN) {
				e.setCancelled(true);
		}
	}
}
