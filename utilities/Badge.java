package utilities;

// Badge class

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Badge implements Serializable{
    private String name;
    private String description;
    private ImageIcon icon;
    private BadgeType type;
    private Level level;
    private int points;
    private Rarity rarity;
    private Category category;

    public Badge(String name, String description) {
        this.name = name;
        this.description = description;
        
    }
    
    public Badge(String name, String description,ImageIcon icon) {
        this.name = name;
        this.description = description;
        this.icon=icon;
        
    }
    
     public Badge(String name, String description, BadgeType type, Level level, int points, Rarity rarity, Category category) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.level = level;
        this.points = points;
        this.rarity = rarity;
        this.category = category;
    }

    public Badge(String name, String description, ImageIcon icon, BadgeType type, Level level, int points, Rarity rarity, Category category) {
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.type = type;
        this.level = level;
        this.points = points;
        this.rarity = rarity;
        this.category = category;
    }
    
    public Badge(String name, String description, ImageIcon icon, BadgeType type, Level level, Rarity rarity, Category category) {
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.type = type;
        this.level = level;
        this.rarity = rarity;
        this.category = category;
    }
    
    public Badge(String name, String description, ImageIcon icon, BadgeType type, Level level, Category category) {
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.type = type;
        this.level = level;
        this.rarity = rarity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
    public Image getIcon(){
        return icon.getImage();
    }

 
    public BadgeType getType() {
        return type;
    }

    public Level getLevel() {
        return level;
    }

    public int getPoints() {
        return points;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public Category getCategory() {
        return category;
    }

    public String getTooltip() {
        return description; // or a shorter tooltip text
    }
    
 

  public BufferedImage getImage() {
    try {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ImageIO.write((BufferedImage) ((ImageIcon) icon).getImage(), "png", bos);
        return ImageIO.read(new ByteArrayInputStream(bos.toByteArray()));
    } catch (IOException e) {
        return null;
    }
}

    @Override
    public String toString() {
        return "Badge:"+ name;
    }
    
   private void writeObject(ObjectOutputStream out) throws IOException {
    out.defaultWriteObject();
    if (icon != null) {
        out.writeObject(icon.getImage());
    } else {
        out.writeObject(null);
    }
}

private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
    in.defaultReadObject();
    Object image = in.readObject();
    if (image != null) {
        icon = new ImageIcon((BufferedImage) image);
    } else {
        icon = null;
    }
}

@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Badge badge = (Badge) o;
        return name.equals(badge.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
  
 

enum BadgeType {
    ACHIEVEMENT,
    MILESTONE,
    REWARD
}

enum Level {
    BRONZE,
    SILVER,
    GOLD
}

enum Rarity {
    COMMON,
    UNCOMMON,
    RARE,
    SPECIAL
}

enum Category {
    QUIZ,
    GAME,
    TRUEFALSE,
    CODING,
    General
}


