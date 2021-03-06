/**
 * Copyright (C) 2010-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.flyway.core.util.logging.apachecommons;

import com.googlecode.flyway.core.util.logging.Log;

/**
 * Wrapper for an Apache Commons Logging logger.
 */
public class ApacheCommonsLog implements Log {
    /**
     * Apache Commons Logging Logger.
     */
    private final org.apache.commons.logging.Log logger;

    /**
     * Creates a new wrapper around this logger.
     *
     * @param logger The original Apache Commons Logging Logger.
     */
    public ApacheCommonsLog(org.apache.commons.logging.Log logger) {
        this.logger = logger;
    }

    public void debug(String message) {
        logger.debug(message);
    }

    public void info(String message) {
        logger.info(message);
    }

    public void warn(String message) {
        logger.warn(message);
    }

    public void error(String message) {
        logger.error(message);
    }

    public void error(String message, Exception e) {
        logger.error(message, e);
    }
}
