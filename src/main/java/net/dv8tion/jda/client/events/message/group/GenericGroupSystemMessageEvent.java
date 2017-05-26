/*
 *     Copyright 2015-2017 Austin Keener & Michael Ritter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dv8tion.jda.client.events.message.group;

import net.dv8tion.jda.client.entities.Group;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.entities.impl.message.SystemMessage;

public abstract class GenericGroupSystemMessageEvent extends GenericGroupMessageEvent
{
    protected final SystemMessage message;

    public GenericGroupSystemMessageEvent(JDA api, long responseNumber, SystemMessage message, Group group)
    {
        super(api, responseNumber, message.getIdLong(), group);
        this.message = message;
    }

    public SystemMessage getMessage()
    {
        return message;
    }

    @Override
    public Group getChannel()
    {
        return (Group) channel;
    }

    @Override
    public boolean isFromType(ChannelType type)
    {
        return type == ChannelType.GROUP;
    }

    @Override
    public ChannelType getChannelType()
    {
        return ChannelType.GROUP;
    }
}
