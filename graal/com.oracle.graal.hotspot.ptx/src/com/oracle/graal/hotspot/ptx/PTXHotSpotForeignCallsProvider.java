/*
 * Copyright (c) 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.oracle.graal.hotspot.ptx;

import com.oracle.graal.api.code.*;
import com.oracle.graal.api.meta.*;
import com.oracle.graal.graph.*;
import com.oracle.graal.hotspot.meta.*;

public class PTXHotSpotForeignCallsProvider implements HotSpotForeignCallsProvider {

    public boolean isReexecutable(ForeignCallDescriptor descriptor) {
        throw GraalInternalError.unimplemented();
    }

    public LocationIdentity[] getKilledLocations(ForeignCallDescriptor descriptor) {
        throw GraalInternalError.unimplemented();
    }

    public boolean canDeoptimize(ForeignCallDescriptor descriptor) {
        throw GraalInternalError.unimplemented();
    }

    public ForeignCallLinkage lookupForeignCall(ForeignCallDescriptor descriptor) {
        throw GraalInternalError.unimplemented();
    }

    public Value[] getNativeABICallerSaveRegisters() {
        throw GraalInternalError.unimplemented();
    }

    public void initialize(HotSpotProviders providers) {
        throw GraalInternalError.unimplemented();
    }
}
