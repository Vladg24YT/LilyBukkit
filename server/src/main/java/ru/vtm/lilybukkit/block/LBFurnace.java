package ru.vtm.lilybukkit.block;

import org.bukkit.block.Furnace;
import org.bukkit.inventory.Inventory;

public class LBFurnace extends LBBlockState implements Furnace {

    /**
     * Get burn time.
     *
     * @return
     */
    @Override
    public short getBurnTime() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Set burn time.
     *
     * @param burnTime
     */
    @Override
    public void setBurnTime(short burnTime) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Get cook time.
     *
     * @return
     */
    @Override
    public short getCookTime() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Set cook time.
     *
     * @param cookTime
     */
    @Override
    public void setCookTime(short cookTime) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Get the block's inventory.
     *
     * @return
     */
    @Override
    public Inventory getInventory() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
