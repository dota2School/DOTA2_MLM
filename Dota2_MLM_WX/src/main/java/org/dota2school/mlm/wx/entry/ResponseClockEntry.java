package org.dota2school.mlm.wx.entry;

import org.dota2school.mlm.wx.domain.SignStudent;
import org.dota2school.mlm.wx.model.SuccessEntry;

public class ResponseClockEntry extends SuccessEntry{

    SignStudent reply;

    public ResponseClockEntry(SignStudent reply){
        this.reply = reply;
    }

    public SignStudent getReply() {
        return reply;
    }

    public void setReply(SignStudent reply) {
        this.reply = reply;
    }
}
