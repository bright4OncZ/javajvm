package com.github.anilople.javajvm.instructions.stack;

import com.github.anilople.javajvm.instructions.BytecodeReader;
import com.github.anilople.javajvm.instructions.Instruction;
import com.github.anilople.javajvm.runtimedataarea.Frame;

/**
 * Operation:
 *      Pop the top operand stack value
 * Description:
 *      Pop the top value from the operand stack.
 *      The pop instruction must not be used unless value is a value of a
 *      category 1 computational type (§2.11.1).
 */
public class POP implements Instruction {
    @Override
    public void FetchOperands(BytecodeReader bytecodeReader) {

    }

    @Override
    public void Execute(Frame frame) {
        frame.getOperandStacks().pop();
    }
}
