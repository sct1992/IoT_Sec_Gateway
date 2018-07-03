/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.config.yangjmxgenerator.attribute;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

final class Util {

    private Util() {
    }
    /**
     * Used for date <-> xml serialization
     */
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(
            "yyyy-MM-dd");

    public static String writeDate(Date date) {
        return DATE_FORMAT.format(date);
    }

    public static Date readDate(String s) throws ParseException {
        return DATE_FORMAT.parse(s);
    }
}
