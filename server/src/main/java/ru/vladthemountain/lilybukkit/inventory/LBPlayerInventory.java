package ru.vladthemountain.lilybukkit.inventory;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.HashMap;

public class LBPlayerInventory implements PlayerInventory {
    /**
     * Get all ItemStacks from the armor slots
     *
     * @return All the ItemStacks from the armor slots
     */
    @Override
    public ItemStack[] getArmorContents() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Return the ItemStack from the helmet slot
     *
     * @return The ItemStack in the helmet slot
     */
    @Override
    public ItemStack getHelmet() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Return the ItemStack from the chestplate slot
     *
     * @return The ItemStack in the chestplate slot
     */
    @Override
    public ItemStack getChestplate() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Return the ItemStack from the leg slot
     *
     * @return The ItemStack in the leg slot
     */
    @Override
    public ItemStack getLeggings() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Return the ItemStack from the boots slot
     *
     * @return The ItemStack in the boots slot
     */
    @Override
    public ItemStack getBoots() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Put the given ItemStacks into the armor slots
     *
     * @param items The ItemStacks to use as armour
     */
    @Override
    public void setArmorContents(ItemStack[] items) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Put the given ItemStack into the helmet slot
     * This does not check if the ItemStack is a helmet
     *
     * @param helmet The ItemStack to use as helmet
     */
    @Override
    public void setHelmet(ItemStack helmet) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Put the given ItemStack into the chestplate slot
     * This does not check if the ItemStack is a chestplate
     *
     * @param chestplate The ItemStack to use as chestplate
     */
    @Override
    public void setChestplate(ItemStack chestplate) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Put the given ItemStack into the leg slot
     * This does not check if the ItemStack is a pair of leggings
     *
     * @param leggings The ItemStack to use as leggings
     */
    @Override
    public void setLeggings(ItemStack leggings) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Put the given ItemStack into the boots slot
     * This does not check if the ItemStack is a boots
     *
     * @param boots The ItemStack to use as boots
     */
    @Override
    public void setBoots(ItemStack boots) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Returns the ItemStack currently hold
     *
     * @return The currently held ItemStack
     */
    @Override
    public ItemStack getItemInHand() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Sets the item in hand
     *
     * @param stack Stack to set
     */
    @Override
    public void setItemInHand(ItemStack stack) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Get the slot number of the currently held item
     *
     * @return Held item slot number
     */
    @Override
    public int getHeldItemSlot() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Returns the size of the inventory
     *
     * @return The inventory size
     */
    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Return the name of the inventory
     *
     * @return The inventory name
     */
    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Get the ItemStack found in the slot at the given index
     *
     * @param index The index of the Slot's ItemStack to return
     * @return The ItemStack in the slot
     */
    @Override
    public ItemStack getItem(int index) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Stores the ItemStack at the given index
     *
     * @param index The index where to put the ItemStack
     * @param item  The ItemStack to set
     */
    @Override
    public void setItem(int index, ItemStack item) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Stores the given ItemStacks in the inventory.
     * <p>
     * This will try to fill existing stacks and empty slots as good as it can.
     * It will return a HashMap of what it couldn't fit.
     *
     * @param items The ItemStacks to add
     * @return
     */
    @Override
    public HashMap<Integer, ItemStack> addItem(ItemStack... items) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Removes the given ItemStacks from the inventory.
     * <p>
     * It will try to remove 'as much as possible' from the types and amounts you
     * give as arguments. It will return a HashMap of what it couldn't remove.
     *
     * @param items The ItemStacks to remove
     * @return
     */
    @Override
    public HashMap<Integer, ItemStack> removeItem(ItemStack... items) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Get all ItemStacks from the inventory
     *
     * @return All the ItemStacks from all slots
     */
    @Override
    public ItemStack[] getContents() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Set the inventory's contents
     *
     * @param items
     * @return All the ItemStacks from all slots
     */
    @Override
    public void setContents(ItemStack[] items) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Check if the inventory contains any ItemStacks with the given materialId
     *
     * @param materialId The materialId to check for
     * @return If any ItemStacks were found
     */
    @Override
    public boolean contains(int materialId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Check if the inventory contains any ItemStacks with the given material
     *
     * @param material The material to check for
     * @return If any ItemStacks were found
     */
    @Override
    public boolean contains(Material material) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Check if the inventory contains any ItemStacks matching the given ItemStack
     * This will only match if both the type and the amount of the stack match
     *
     * @param item The ItemStack to match against
     * @return If any matching ItemStacks were found
     */
    @Override
    public boolean contains(ItemStack item) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Check if the inventory contains any ItemStacks with the given materialId and at least the minimum amount specified
     *
     * @param materialId The materialId to check for
     * @param amount     The minimum amount to look for
     * @return If any ItemStacks were found
     */
    @Override
    public boolean contains(int materialId, int amount) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Check if the inventory contains any ItemStacks with the given material and at least the minimum amount specified
     *
     * @param material The material to check for
     * @param amount
     * @return If any ItemStacks were found
     */
    @Override
    public boolean contains(Material material, int amount) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Check if the inventory contains any ItemStacks matching the given ItemStack and at least the minimum amount specified
     * This will only match if both the type and the amount of the stack match
     *
     * @param item   The ItemStack to match against
     * @param amount
     * @return If any matching ItemStacks were found
     */
    @Override
    public boolean contains(ItemStack item, int amount) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Find all slots in the inventory containing any ItemStacks with the given materialId
     *
     * @param materialId The materialId to look for
     * @return The Slots found.
     */
    @Override
    public HashMap<Integer, ? extends ItemStack> all(int materialId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Find all slots in the inventory containing any ItemStacks with the given material
     *
     * @param material@return The Slots found.
     */
    @Override
    public HashMap<Integer, ? extends ItemStack> all(Material material) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Find all slots in the inventory containing any ItemStacks with the given ItemStack
     * This will only match slots if both the type and the amount of the stack match
     *
     * @param item The ItemStack to match against
     * @return The Slots found.
     */
    @Override
    public HashMap<Integer, ? extends ItemStack> all(ItemStack item) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Find the first slot in the inventory containing an ItemStack with the given materialId
     *
     * @param materialId The materialId to look for
     * @return The Slot found.
     */
    @Override
    public int first(int materialId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Find the first slot in the inventory containing an ItemStack with the given material
     *
     * @param material@return The Slot found.
     */
    @Override
    public int first(Material material) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Find the first slot in the inventory containing an ItemStack with the given stack
     * This will only match a slot if both the type and the amount of the stack match
     *
     * @param item The ItemStack to match against
     * @return The Slot found.
     */
    @Override
    public int first(ItemStack item) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Find the first empty Slot.
     *
     * @return The first empty Slot found.
     */
    @Override
    public int firstEmpty() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Remove all stacks in the inventory matching the given materialId.
     *
     * @param materialId The material to remove
     */
    @Override
    public void remove(int materialId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Remove all stacks in the inventory matching the given material.
     *
     * @param material The material to remove
     */
    @Override
    public void remove(Material material) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Remove all stacks in the inventory matching the given stack.
     * This will only match a slot if both the type and the amount of the stack match
     *
     * @param item The ItemStack to match against
     */
    @Override
    public void remove(ItemStack item) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Clear out a particular slot in the index
     *
     * @param index The index to empty.
     */
    @Override
    public void clear(int index) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Clear out the whole index
     */
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}