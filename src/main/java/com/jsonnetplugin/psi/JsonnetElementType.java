package com.jsonnetplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.jsonnetplugin.JsonnetLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class JsonnetElementType extends IElementType {
    public JsonnetElementType(@NotNull @NonNls String debugName) {
        super(debugName, JsonnetLanguage.INSTANCE);
    }
}
