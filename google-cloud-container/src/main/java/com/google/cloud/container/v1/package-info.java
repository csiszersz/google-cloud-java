/*
 * Copyright 2017, Google LLC All rights reserved.
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

/**
 * A client to Google Container Engine API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>==================== ClusterManagerClient ====================
 *
 * <p>Service Description: Google Container Engine Cluster Manager v1
 *
 * <p>Sample for ClusterManagerClient:
 *
 * <pre>
 * <code>
 * try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
 *   String projectId = "";
 *   String zone = "";
 *   ListClustersResponse response = clusterManagerClient.listClusters(projectId, zone);
 * }
 * </code>
 * </pre>
 */
package com.google.cloud.container.v1;
