/**
 * Copyright (c) 2018-2023, Sylvain Baudoin
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
package com.github.sbaudoin.sonar.plugins.yaml.checks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckRepositoryTest {
    @Test
    void testGetParsingErrorCheckClass() {
        assertEquals(ParsingErrorCheck.class, CheckRepository.getParsingErrorCheckClass());
    }

    @Test
    void testGetCheckClasses() {
        assertEquals(29, CheckRepository.getCheckClasses().size());
        assertTrue(CheckRepository.getCheckClasses().contains(ParsingErrorCheck.class));
    }

    @Test
    void testGetTemplateRuleKeys() {
        assertEquals(5, CheckRepository.getTemplateRuleKeys().size());
        assertTrue(CheckRepository.getTemplateRuleKeys().contains("ForbiddenKeyCheck"));
        assertTrue(CheckRepository.getTemplateRuleKeys().contains("IntValueInRangeCheck"));
        assertTrue(CheckRepository.getTemplateRuleKeys().contains("DurationInRangeCheck"));
    }
}
