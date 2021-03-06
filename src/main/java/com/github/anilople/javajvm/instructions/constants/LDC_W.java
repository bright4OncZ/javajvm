package com.github.anilople.javajvm.instructions.constants;

import com.github.anilople.javajvm.instructions.BytecodeReader;
import com.github.anilople.javajvm.instructions.Instruction;
import com.github.anilople.javajvm.runtimedataarea.Frame;

public class LDC_W implements Instruction {

    //    private byte indexbyte1;

//    private byte indexbyte2;

    // use short replace above 2 bytes
    private short index;

    @Override
    public void fetchOperands(BytecodeReader bytecodeReader) {
        this.index = bytecodeReader.readU2();
    }

    @Override
    public void execute(Frame frame) {
        throw new RuntimeException("Now cannot support " + this.getClass());
//        int nextPc = frame.getNextPc() + this.size();
//        frame.setNextPc(nextPc);
    }

    @Override
    public int size() {
        return 1;
    }
}
