// Copyright 2021 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.admanager.jaxws.v202111;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrpSettingsError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrpSettingsError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_AGE_RANGE"/>
 *     &lt;enumeration value="LINE_ITEM_ENVIRONMENT_TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="NIELSEN_DAR_REQUIRES_INSTREAM_VIDEO"/>
 *     &lt;enumeration value="LINE_ITEM_TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="CANNOT_SPECIFY_GENDER_FOR_GIVEN_AGE_RANGE"/>
 *     &lt;enumeration value="INVALID_MIN_AGE"/>
 *     &lt;enumeration value="INVALID_MAX_AGE"/>
 *     &lt;enumeration value="CANNOT_DISABLE_GRP_AFTER_ENABLING"/>
 *     &lt;enumeration value="CANNOT_CHANGE_GRP_PROVIDERS"/>
 *     &lt;enumeration value="CANNOT_CHANGE_GRP_SETTINGS"/>
 *     &lt;enumeration value="GRP_AUDIENCE_GOAL_NOT_SUPPORTED"/>
 *     &lt;enumeration value="DEMOG_GOAL_EXPECTED"/>
 *     &lt;enumeration value="CANNOT_SET_GRP_AUDIENCE_GOAL"/>
 *     &lt;enumeration value="CANNOT_REMOVE_GRP_AUDIENCE_GOAL"/>
 *     &lt;enumeration value="UNSUPPORTED_GEO_TARGETING"/>
 *     &lt;enumeration value="UNSUPPORTED_GRP_SETTING"/>
 *     &lt;enumeration value="SHOULD_SET_IN_TARGET_GOAL_THROUGH_GRP_SETTINGS"/>
 *     &lt;enumeration value="SHOULD_SET_IN_TARGET_GOAL_THROUGH_PRIMARY_GOAL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GrpSettingsError.Reason")
@XmlEnum
public enum GrpSettingsErrorReason {


    /**
     * 
     *                 Age range for GRP audience is not valid. Please see the
     *                 <a href="https://support.google.com/dfp_premium/answer/6135438">Ad Manager Help Center</a>
     *                 for more information.
     *               
     * 
     */
    INVALID_AGE_RANGE,

    /**
     * 
     *                 GRP settings are only supported for video line items.
     *               
     * 
     */
    LINE_ITEM_ENVIRONMENT_TYPE_NOT_SUPPORTED,

    /**
     * 
     *                 For deals with Nielsen DAR enabled, there must be an instream video environment.
     *               
     * 
     */
    NIELSEN_DAR_REQUIRES_INSTREAM_VIDEO,

    /**
     * 
     *                 GRP settings are not supported for the given line item type.
     *               
     * 
     */
    LINE_ITEM_TYPE_NOT_SUPPORTED,

    /**
     * 
     *                 GRP audience gender cannot be specified for the selected age range.
     *               
     * 
     */
    CANNOT_SPECIFY_GENDER_FOR_GIVEN_AGE_RANGE,

    /**
     * 
     *                 Minimum age for GRP audience is not valid.
     *               
     * 
     */
    INVALID_MIN_AGE,

    /**
     * 
     *                 Maximum age for GRP audience is not valid.
     *               
     * 
     */
    INVALID_MAX_AGE,

    /**
     * 
     *                 GRP settings cannot be disabled.
     *               
     * 
     */
    CANNOT_DISABLE_GRP_AFTER_ENABLING,

    /**
     * 
     *                 GRP provider cannot be updated.
     *               
     * 
     */
    CANNOT_CHANGE_GRP_PROVIDERS,

    /**
     * 
     *                 GRP settings cannot be updated once the line item has started serving.
     *               
     * 
     */
    CANNOT_CHANGE_GRP_SETTINGS,

    /**
     * 
     *                 Impression goal based on GRP audience is not supported.
     *               
     * 
     */
    GRP_AUDIENCE_GOAL_NOT_SUPPORTED,

    /**
     * 
     *                 Impression goal based on GRP audience expected.
     *               
     * 
     */
    DEMOG_GOAL_EXPECTED,

    /**
     * 
     *                 Impression goal based on GRP audience cannot be set once the line item has started serving.
     *               
     * 
     */
    CANNOT_SET_GRP_AUDIENCE_GOAL,

    /**
     * 
     *                 Impression goal based on GRP audience cannot be removed once the line item has started
     *                 serving.
     *               
     * 
     */
    CANNOT_REMOVE_GRP_AUDIENCE_GOAL,

    /**
     * 
     *                 Unsupported geographic location targeted for line item with GRP audience goal.
     *               
     * 
     */
    UNSUPPORTED_GEO_TARGETING,

    /**
     * 
     *                 GRP Settings specified are unsupported.
     *               
     * 
     */
    UNSUPPORTED_GRP_SETTING,

    /**
     * 
     *                 In-target line items should be set through the grpSettings target impression goal.
     *               
     * 
     */
    SHOULD_SET_IN_TARGET_GOAL_THROUGH_GRP_SETTINGS,

    /**
     * 
     *                 In-target line items should be set through the primaryReservationUnit's in-target Impressions
     *                 unit type.
     *               
     * 
     */
    SHOULD_SET_IN_TARGET_GOAL_THROUGH_PRIMARY_GOAL,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static GrpSettingsErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
