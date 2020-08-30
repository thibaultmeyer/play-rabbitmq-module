/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 - 2020 Thibault Meyer
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.zero_x_baadf00d.play.module.rabbitmq;

import com.rabbitmq.client.Channel;

import java.io.IOException;
import java.util.Map;

/**
 * RabbitMQ module give access to methods to easily
 * use a RabbitMQ message queues server.
 *
 * @author Thibault Meyer
 * @version 16.05.24
 * @since 16.05.19
 */
public interface RabbitMQModule {

    /**
     * Retrieve the server properties. This method will return a map of
     * the server properties. This typically includes the product name
     * and version of the server.
     *
     * @return A map of the server properties.
     * @since 16.05.23
     */
    Map<String, Object> getServerProperties();

    /**
     * Get the negotiated maximum channel number. Usable channel
     * numbers range from 1 to this number, inclusive.
     *
     * @return The maximum channel number permitted for this connection
     * @since 16.05.23
     */
    int getChannelMax();

    /**
     * Get the number of messages left on the given queue.
     *
     * @param queueName The queue name
     * @return The number of messages
     * @throws IOException when something goes wrong
     * @since 16.05.23
     */
    long getMessageCount(final String queueName) throws IOException;

    /**
     * Get the number of consumers who use the given queue.
     *
     * @param queueName The queue name
     * @return The number of consumers
     * @throws IOException when something goes wrong
     * @since 16.05.23
     */
    long getConsumerCountCount(final String queueName) throws IOException;

    /**
     * Get a new handle to a channel.
     *
     * @return The channel
     * @throws IOException when something goes wrong
     * @since 16.05.19
     */
    Channel getChannel() throws IOException;

    /**
     * Get a new handle to a channel with a declared queue.
     *
     * @param queueName The queue name
     * @return The channel to the declared queue
     * @throws IOException when something goes wrong
     * @since 16.05.19
     */
    Channel getChannel(final String queueName) throws IOException;
}
