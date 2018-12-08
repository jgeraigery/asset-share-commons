/*
 * Asset Share Commons
 *
 * Copyright (C) 2017 Adobe
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 */

package com.adobe.aem.commons.assetshare.content.properties.impl;

import com.adobe.aem.commons.assetshare.content.properties.ComputedProperty;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

import static com.adobe.aem.commons.assetshare.content.properties.ComputedProperty.DEFAULT_ASC_COMPUTED_PROPERTY_SERVICE_RANKING;

/**
 * This Computed Property returns a UTF-8 encoded path to the asset.
 *
 * The asset path is collected via the PathImpl Computed Property.
 */
@Component(
        service = ComputedProperty.class,
        property = {
                Constants.SERVICE_RANKING + "=" + DEFAULT_ASC_COMPUTED_PROPERTY_SERVICE_RANKING
        }
)
@Designate(ocd = PathEncodedImpl.Cfg.class)
@Deprecated
public class PathEncodedImpl extends PathEscapedImpl {
    public static final String LABEL = "Asset Path (UTF-8 Encoded)";
    public static final String NAME = "path/encoded";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getLabel() {
        return LABEL;
    }

    @Override
    public String[] getTypes() {
        return new String[]{};
    }
}
