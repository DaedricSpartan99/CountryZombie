package atlas.numixe;

import java.util.Random;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class MainPlugin extends JavaPlugin {
	
	public static MainPlugin plugin = null;
	public Lobby lobby;
	
	private Random random;

	public void onEnable() {
    	
    	plugin = this;
    	random = new Random();
    	lobby = new Lobby();
    }
   
    public void onDisable() {
    	
    	
    }
    
    public int randomInt(int start, int range) {
    	
    	return random.nextInt(range) + start;
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    	
        return true;
    }
}
