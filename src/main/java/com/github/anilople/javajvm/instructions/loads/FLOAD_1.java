package com.github.anilople.javajvm.instructions.loads;

import com.github.anilople.javajvm.instructions.BytecodeReader;
import com.github.anilople.javajvm.instructions.Instruction;
import com.github.anilople.javajvm.runtimedataarea.Frame;

public class FLOAD_1 implements Instruction {

    @Override
    public void fetchOperands(BytecodeReader bytecodeReader) {

    }

    @Override
    public void execute(Frame frame) {
        FLOAD.execute(this, frame, 1);
    }

    @Override
    public int size() {
        return 1;
    }

}
