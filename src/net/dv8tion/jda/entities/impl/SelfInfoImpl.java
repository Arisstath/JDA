package net.dv8tion.jda.entities.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.dv8tion.jda.entities.Channel;
import net.dv8tion.jda.entities.SelfInfo;

public class SelfInfoImpl extends UserImpl implements SelfInfo
{
    private String email;
    private List<Channel> mutedChannels;
    private boolean verified;

    @Override
    public String getEmail()
    {
        return email;
    }

    @Override
    public List<Channel> getMutedChannels()
    {
        ArrayList<Channel> unmodifiableList = new ArrayList<Channel>();
        for (Channel channel : mutedChannels)
            unmodifiableList.add(channel);
        return Collections.unmodifiableList(unmodifiableList);
    }

    @Override
    public boolean isVerified()
    {
        return verified;
    }

    public SelfInfoImpl setEmail(String email)
    {
        this.email = email;
        return this;
    }

    public SelfInfoImpl setMutedChannels(List<Channel> mutedChannels)
    {
        this.mutedChannels = mutedChannels;
        return this;
    }

    public SelfInfoImpl setVerified(boolean verified)
    {
        this.verified = verified;
        return this;
    }

    public List<Channel> getMutedChannelsModifiable()
    {
        if (mutedChannels == null)
            mutedChannels = new ArrayList<Channel>();
        return mutedChannels;
    }
}