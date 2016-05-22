/*
 * Copyright 2016 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.gooeysQuests.api;

import org.terasology.entitySystem.event.AbstractConsumableEvent;
import org.terasology.structureTemplates.util.transform.BlockRegionTransform;

/**
 * Sent to entities with spawn condition components, in order to check if the spawn conditions are met at a certain
 * position. See {@link SolidBlockRegionConditionComponent} for an example for a spawn condition component.
 */
public class CheckSpawnConditionEvent extends AbstractConsumableEvent {
    private BlockRegionTransform blockRegionTransform;

    public CheckSpawnConditionEvent(BlockRegionTransform blockRegionTransform) {
        this.blockRegionTransform = blockRegionTransform;
    }

    public BlockRegionTransform getBlockRegionTransform() {
        return blockRegionTransform;
    }
}
