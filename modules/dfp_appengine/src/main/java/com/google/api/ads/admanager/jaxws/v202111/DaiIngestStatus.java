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
 * <p>Java class for DaiIngestStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DaiIngestStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="FAILURE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DaiIngestStatus")
@XmlEnum
public enum DaiIngestStatus {


    /**
     * 
     *                 The content was successfully ingested for DAI.
     *               
     * 
     */
    SUCCESS,

    /**
     * 
     *                 There was a non-fatal issue during the DAI ingestion proccess.
     *               
     * 
     */
    WARNING,

    /**
     * 
     *                 There was a non-fatal issue during the DAI ingestion proccess and the content is not available
     *                 for dynamic ad insertion.
     *               
     * 
     */
    FAILURE,

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

    public static DaiIngestStatus fromValue(String v) {
        return valueOf(v);
    }

}
