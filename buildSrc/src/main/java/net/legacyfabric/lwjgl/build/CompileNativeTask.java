package net.legacyfabric.lwjgl.build;

import org.gradle.api.provider.ListProperty;
import org.gradle.api.tasks.Exec;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.SourceSet;

public abstract class CompileNativeTask extends Exec {
    @Input
    abstract ListProperty<SourceSet> getInputSourceSets();
}
