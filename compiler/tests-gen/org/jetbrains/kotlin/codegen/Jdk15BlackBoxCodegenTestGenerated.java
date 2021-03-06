/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/java15/box")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class Jdk15BlackBoxCodegenTestGenerated extends AbstractJdk15BlackBoxCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInBox() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/java15/box"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("compiler/testData/codegen/java15/box/records")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Records extends AbstractJdk15BlackBoxCodegenTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInRecords() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/java15/box/records"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("bytecodeShapeForJava.kt")
        public void testBytecodeShapeForJava() throws Exception {
            runTest("compiler/testData/codegen/java15/box/records/bytecodeShapeForJava.kt");
        }

        @TestMetadata("collectionSizeOverrides.kt")
        public void testCollectionSizeOverrides() throws Exception {
            runTest("compiler/testData/codegen/java15/box/records/collectionSizeOverrides.kt");
        }

        @TestMetadata("dataJvmRecord.kt")
        public void testDataJvmRecord() throws Exception {
            runTest("compiler/testData/codegen/java15/box/records/dataJvmRecord.kt");
        }

        @TestMetadata("propertiesOverrides.kt")
        public void testPropertiesOverrides() throws Exception {
            runTest("compiler/testData/codegen/java15/box/records/propertiesOverrides.kt");
        }

        @TestMetadata("propertiesOverridesAllCompatibilityJvmDefault.kt")
        public void testPropertiesOverridesAllCompatibilityJvmDefault() throws Exception {
            runTest("compiler/testData/codegen/java15/box/records/propertiesOverridesAllCompatibilityJvmDefault.kt");
        }

        @TestMetadata("propertiesOverridesEnableJvmDefault.kt")
        public void testPropertiesOverridesEnableJvmDefault() throws Exception {
            runTest("compiler/testData/codegen/java15/box/records/propertiesOverridesEnableJvmDefault.kt");
        }

        @TestMetadata("recordDifferentPropertyOverride.kt")
        public void testRecordDifferentPropertyOverride() throws Exception {
            runTest("compiler/testData/codegen/java15/box/records/recordDifferentPropertyOverride.kt");
        }

        @TestMetadata("recordDifferentSyntheticProperty.kt")
        public void testRecordDifferentSyntheticProperty() throws Exception {
            runTest("compiler/testData/codegen/java15/box/records/recordDifferentSyntheticProperty.kt");
        }

        @TestMetadata("recordPropertyAccess.kt")
        public void testRecordPropertyAccess() throws Exception {
            runTest("compiler/testData/codegen/java15/box/records/recordPropertyAccess.kt");
        }
    }
}
