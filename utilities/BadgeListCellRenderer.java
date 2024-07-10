package utilities;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import UserProfile.UserData;

public class BadgeListCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

        if (value instanceof Badge badge) {
            setText(badge.getName()); 

            boolean userHasBadge = currentUserHasBadge(badge);
            
            if (userHasBadge) {
                setBackground(new Color(144, 238, 144)); 
            } else {
                setBackground(Color.WHITE); 
            }
        }

        return this;
    }

    
    private boolean currentUserHasBadge(Badge badge) {
        UserData currentUser = UserData.getInstance();
        List<Badge> userBadges = currentUser.getBadgesEarned();
        
       
        for (Badge userBadge : userBadges) {
            if (userBadge.getName().equals(badge.getName())) {
                return true; 
            }
        }
        return false; 
    }
}
