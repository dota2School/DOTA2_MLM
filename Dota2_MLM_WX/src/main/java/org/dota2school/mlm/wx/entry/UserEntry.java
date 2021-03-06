package org.dota2school.mlm.wx.entry;

import org.dota2school.mlm.wx.domain.User;
import org.dota2school.mlm.wx.model.SuccessEntry;

public class UserEntry  extends SuccessEntry{
    private User userInfo;

    public UserEntry(User user){
        this.userInfo = user;
    }

    public User getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(User userInfo) {
        this.userInfo = userInfo;
    }
}
