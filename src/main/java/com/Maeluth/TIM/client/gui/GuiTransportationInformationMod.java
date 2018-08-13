package com.Maeluth.TIM.client.gui;

import com.Maeluth.TIM.TransportationInformationMod;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class GuiTransportationInformationMod extends GuiScreen {


    //Add This Later
    //ResourceLocation texture = new ResourceLocation(TransportationInformationMod.MODID,  resourcePathln: "placeholderfilepath")

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    public void initGui() {
        super.initGui();
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode) throws IOException {
        super.keyTyped(typedChar, keyCode);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
