package me.hiddenaether.joineffect;

import java.util.Random;
import java.util.logging.Logger;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Builder;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.FileConfigurationOptions;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Main extends JavaPlugin implements Listener {
	
  public void onEnable() {
	  
    getServer().getPluginManager().registerEvents(this, this);
    getConfig().options().copyDefaults(true);
    saveDefaultConfig();
    
    getLogger().info("JoinEffect v3 has been successfully enabled!");
    getLogger().info("Version 3 Supports 11.3+");
    
  }
  
  public void onDisable() {
	  
    getLogger().info("JoinEffect has been successfully disabled!");
    
  }
  
  private Color getColor(int i) {
	  
    Color c = null;
    if (i == 1) {
      c = Color.AQUA;
    }
    if (i == 2) {
      c = Color.BLACK;
    }
    if (i == 3) {
      c = Color.BLUE;
    }
    if (i == 4) {
      c = Color.FUCHSIA;
    }
    if (i == 5) {
      c = Color.GRAY;
    }
    if (i == 6) {
      c = Color.GREEN;
    }
    if (i == 7) {
      c = Color.LIME;
    }
    if (i == 8) {
      c = Color.MAROON;
    }
    if (i == 9) {
      c = Color.NAVY;
    }
    if (i == 10) {
      c = Color.OLIVE;
    }
    if (i == 11) {
      c = Color.ORANGE;
    }
    if (i == 12) {
      c = Color.PURPLE;
    }
    if (i == 13) {
      c = Color.RED;
    }
    if (i == 14) {
      c = Color.SILVER;
    }
    if (i == 15) {
      c = Color.TEAL;
    }
    if (i == 16) {
      c = Color.WHITE;
    }
    if (i == 17) {
      c = Color.YELLOW;
    }
    return c;
    
  }
  
  @EventHandler
  public void onJoin(PlayerJoinEvent event)
  {
    Player player = event.getPlayer();
    if ((getConfig().getBoolean("RemoveEffects")) && 
      (player.hasPermission("joineffect.remove"))) {
      for (PotionEffect effect : player.getActivePotionEffects()) {
        player.removePotionEffect(effect.getType());
      }
    }
    if ((getConfig().getBoolean("JumpEnabled")) && 
      (player.hasPermission("joineffect.jump"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, getConfig().getInt("JumpTime"), getConfig().getInt("JumpHeight")));
    }
    if ((getConfig().getBoolean("SpeedEnabled")) && 
      (player.hasPermission("joineffect.speed"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, getConfig().getInt("SpeedTime"), getConfig().getInt("SpeedLevel")));
    }
    if ((getConfig().getBoolean("ConfusionEnabled")) && 
      (player.hasPermission("joineffect.confusion"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, getConfig().getInt("ConfusionTime"), getConfig().getInt("ConfusionLevel")));
    }
    if ((getConfig().getBoolean("WitherEnabled")) && 
      (player.hasPermission("joineffect.wither"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, getConfig().getInt("WitherTime"), getConfig().getInt("WitherLevel")));
    }
    if ((getConfig().getBoolean("BlindnessEnabled")) && 
      (player.hasPermission("joineffect.blindness"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, getConfig().getInt("BlindnessTime"), getConfig().getInt("BlindnessLevel")));
    }
    if ((getConfig().getBoolean("DamageResistanceEnabled")) && 
      (player.hasPermission("joineffect.damage"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, getConfig().getInt("DamageResistanceTime"), getConfig().getInt("DamageResistanceLevel")));
    }
    if ((getConfig().getBoolean("FastDiggingEnabled")) && 
      (player.hasPermission("joineffect.fastdigging"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, getConfig().getInt("FastDiggingTime"), getConfig().getInt("FastDiggingLevel")));
    }
    if ((getConfig().getBoolean("FireResitanceEnabled")) && 
      (player.hasPermission("joineffect.fireresistance"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, getConfig().getInt("FireResitanceTime"), getConfig().getInt("FireResitanceLevel")));
    }
    if ((getConfig().getBoolean("HarmEnabled")) && 
      (player.hasPermission("joineffect.harm"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, getConfig().getInt("HarmTime"), getConfig().getInt("HarmLevel")));
    }
    if ((getConfig().getBoolean("HealEnabled")) && 
      (player.hasPermission("joineffect.heal"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, getConfig().getInt("HealTime"), getConfig().getInt("HealLevel")));
    }
    if ((getConfig().getBoolean("HungerEnabled")) && 
      (player.hasPermission("joineffect.hunger"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, getConfig().getInt("HungerTime"), getConfig().getInt("HungerLevel")));
    }
    if ((getConfig().getBoolean("StrengthEnabled")) && 
      (player.hasPermission("joineffect.strength"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, getConfig().getInt("StrengthTime"), getConfig().getInt("StrenghtLevel")));
    }
    if ((getConfig().getBoolean("InvisibilityEnabled")) && 
      (player.hasPermission("joineffect.invisible"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, getConfig().getInt("InvisibilityTime"), getConfig().getInt("InvisibilityLevel")));
    }
    if ((getConfig().getBoolean("NightVisionEnabled")) && 
      (player.hasPermission("joineffect.nightvision"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, getConfig().getInt("NightVisionTime"), getConfig().getInt("NightVisionLevel")));
    }
    if ((getConfig().getBoolean("PoisonEnabled")) && 
      (player.hasPermission("joineffect.poison"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, getConfig().getInt("PoisonTime"), getConfig().getInt("PoisonLevel")));
    }
    if ((getConfig().getBoolean("RegenerationEnabled")) && 
      (player.hasPermission("joineffect.regeneration"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, getConfig().getInt("RegenerationTime"), getConfig().getInt("RegenerationLevel")));
    }
    if ((getConfig().getBoolean("SlownessEnabled")) && 
      (player.hasPermission("joineffect.slowness"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, getConfig().getInt("SlownessTime"), getConfig().getInt("SlownessLevel")));
    }
    if ((getConfig().getBoolean("SlowDiggingEnabled")) && 
      (player.hasPermission("joineffect.slowdigging"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, getConfig().getInt("SlowDiggingTime"), getConfig().getInt("SlowDiggingLevel")));
    }
    if ((getConfig().getBoolean("WaterBreathingEnabled")) && 
      (player.hasPermission("joineffect.waterbreathing"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, getConfig().getInt("WaterBreathingTime"), getConfig().getInt("WaterBreathingLevel")));
    }
    if ((getConfig().getBoolean("WeaknessEnabled")) && 
      (player.hasPermission("joineffect.weakness"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, getConfig().getInt("WeaknessTime"), getConfig().getInt("WeaknessLevel")));
    }
    if ((getConfig().getBoolean("SaturationEnabled")) && 
      (player.hasPermission("joineffect.saturation"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, getConfig().getInt("SaturationTime"), getConfig().getInt("SaturationLevel")));
    }
    if ((getConfig().getBoolean("HealthBoostEnabled")) && 
      (player.hasPermission("joineffect.healthboost"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, getConfig().getInt("HealthBoostTime"), getConfig().getInt("HealthBoostLevel")));
    }
    if ((getConfig().getBoolean("GlwoingEnabled")) && 
      (player.hasPermission("joineffect.glowing"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, getConfig().getInt("GlowingTime"), getConfig().getInt("GlowingLevel")));
    }
    if ((getConfig().getBoolean("LevitationEnabled")) && 
      (player.hasPermission("joineffect.levitation"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, getConfig().getInt("LevitationTime"), getConfig().getInt("LevitationLevel")));
    }
    if ((getConfig().getBoolean("LuckEnabled")) && 
      (player.hasPermission("joineffect.luck"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.LUCK, getConfig().getInt("LuckTime"), getConfig().getInt("LuckLevel")));
    }
    if ((getConfig().getBoolean("UnluckEnabled")) && 
      (player.hasPermission("joineffect.unluck"))) {
      player.addPotionEffect(new PotionEffect(PotionEffectType.UNLUCK, getConfig().getInt("UnluckTime"), getConfig().getInt("UnluckLevel")));
    }
    if ((getConfig().getBoolean("DolphinsGraceEnabled")) && 
    	(player.hasPermission("joineffect.dolphinsgrace"))) {
    	player.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, getConfig().getInt("DolphinsGraceTime"), getConfig().getInt("DolphinsGraceLevel")));
    }
    if ((getConfig().getBoolean("ConduitPowerEnabled")) && 
        (player.hasPermission("joineffect.conduitpower"))) {
        player.addPotionEffect(new PotionEffect(PotionEffectType.CONDUIT_POWER, getConfig().getInt("ConduitPowerTime"), getConfig().getInt("ConduitPowerLevel")));
    }
    if (getConfig().getBoolean("FireworksEnabled")) {
    	
      Player player1 = event.getPlayer();
      
      Firework fw = (Firework)player1.getWorld().spawnEntity(player1.getLocation(), EntityType.FIREWORK);
      FireworkMeta fwm = fw.getFireworkMeta();
      
      Random r = new Random();
      
      int rt = r.nextInt(4) + 1;
      FireworkEffect.Type type = FireworkEffect.Type.BALL;
      
      if (rt == 1) {
        type = FireworkEffect.Type.BALL;
      }
      if (rt == 2) {
        type = FireworkEffect.Type.BALL_LARGE;
      }
      if (rt == 3) {
        type = FireworkEffect.Type.BURST;
      }
      if (rt == 4) {
        type = FireworkEffect.Type.CREEPER;
      }
      if (rt == 5) {
        type = FireworkEffect.Type.STAR;
      }
      
      int r1i = r.nextInt(17) + 1;
      int r2i = r.nextInt(17) + 1;
      Color c1 = getColor(r1i);
      Color c2 = getColor(r2i);
      
      FireworkEffect effect = FireworkEffect.builder().flicker(r.nextBoolean()).withColor(c1).withFade(c2).with(type).trail(r.nextBoolean()).build();
      
      fwm.addEffect(effect);
      
      int rp = r.nextInt(2) + 1;
      fwm.setPower(rp);
      
      fw.setFireworkMeta(fwm);
      
    }
  }
}
