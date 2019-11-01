package com.github.anilople.javajvm.classfile.constantinfo;

import com.github.anilople.javajvm.classfile.ClassFile;
import com.github.anilople.javajvm.constants.ConstantPoolTags;

public class ConstantUtf8Info extends ConstantPoolInfo {

    public static final byte TAG = ConstantPoolTags.CONSTANT_Utf8;

    private short length;

    private byte[] bytes;

    @Override
    public byte getTag() {
        return TAG;
    }

    public ConstantUtf8Info(ClassFile classFile, ClassFile.ClassReader classReader) {
        super(classFile);
        this.length = classReader.readU2();
        this.bytes = classReader.readBytes(this.length);
    }

    public short getLength() {
        return length;
    }

    public byte[] getBytes() {
        return bytes;
    }
}