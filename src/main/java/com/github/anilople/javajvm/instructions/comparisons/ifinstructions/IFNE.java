package com.github.anilople.javajvm.instructions.comparisons.ifinstructions;

import com.github.anilople.javajvm.instructions.BytecodeReader;
import com.github.anilople.javajvm.instructions.Instruction;
import com.github.anilople.javajvm.runtimedataarea.Frame;

public class IFNE extends IF implements Instruction {

    @Override
    public void execute(Frame frame) {
        this.execute(frame, value -> 0 != value);
    }

}
