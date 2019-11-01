package com.github.anilople.javajvm.classfile.constantinfo;

import com.github.anilople.javajvm.classfile.ClassFile;
import com.github.anilople.javajvm.constants.ConstantPoolTags;

public class ConstantFloatInfo extends ConstantPoolInfo {

    public static final byte TAG = ConstantPoolTags.CONSTANT_Float;

    private int bytes;

    @Override
    public byte getTag() {
        return TAG;
    }

    public ConstantFloatInfo(ClassFile classFile, ClassFile.ClassReader classReader) {
        super(classFile);
        this.bytes = classReader.readU4();
    }
}