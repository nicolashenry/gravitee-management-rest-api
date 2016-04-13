/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
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
package io.gravitee.management.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author David BRASSELY (david at gravitee.io)
 * @author GraviteeSource Team
 */
public class InstanceEntity {

    private String id;

    @JsonProperty("started_at")
    private Date startedAt;

    @JsonProperty("last_heartbeat_at")
    private Date lastHeartbeatAt;

    @JsonProperty("stopped_at")
    private Date stoppedAt;

    private String hostname;

    private String ip;

    private String version;

    private List<String> tags;

    private InstanceState state = InstanceState.UNKNOWN;

    private Map<String, String> systemProperties;

    public InstanceEntity(String id) {
        this.id = id;
    }

    public InstanceEntity() {
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public Date getStoppedAt() {
        return stoppedAt;
    }

    public void setStoppedAt(Date stoppedAt) {
        this.stoppedAt = stoppedAt;
    }

    public Date getLastHeartbeatAt() {
        return lastHeartbeatAt;
    }

    public void setLastHeartbeatAt(Date lastHeartbeatAt) {
        this.lastHeartbeatAt = lastHeartbeatAt;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public InstanceState getState() {
        return state;
    }

    public void setState(InstanceState state) {
        this.state = state;
    }

    public Map<String, String> getSystemProperties() {
        return systemProperties;
    }

    public void setSystemProperties(Map<String, String> systemProperties) {
        this.systemProperties = systemProperties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstanceEntity that = (InstanceEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}