/*
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.cluster.datastore;

import akka.actor.ActorRef;
import org.opendaylight.controller.cluster.datastore.messages.RegisterChangeListener;
import org.opendaylight.controller.md.sal.common.api.data.AsyncDataChangeListener;
import org.opendaylight.yangtools.yang.data.api.YangInstanceIdentifier;
import org.opendaylight.yangtools.yang.data.api.schema.NormalizedNode;

final class DelayedDataChangeListenerRegistration extends DelayedListenerRegistration<
           AsyncDataChangeListener<YangInstanceIdentifier, NormalizedNode<?, ?>>, RegisterChangeListener> {

    DelayedDataChangeListenerRegistration(final RegisterChangeListener registerChangeListener,
            final ActorRef registrationActor) {
        super(registerChangeListener, registrationActor);
    }
}
