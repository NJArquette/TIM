package com.Maeluth.TIM.client.gui;

import com.Maeluth.TIM.TransportationInformationMod;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class GuiTransportationInformationMod extends GuiScreen {


    //Add This Later, GUI texture?
//     final ResourceLocation texture = new ResourceLocation(TransportationInformationMod.MODID, resourcePathln: "placeholderfilepath")
    int guiWidth = 150;
    int guiHeigth = 200;


    //Very important, lets us draw stuff on the GUI
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        int centerX = (width /2) - guiWidth / 2;
        int centerY = (height /2) - guiHeigth / 2;

        super.drawScreen(mouseX, mouseY, partialTicks);
    }


    //GUI don't work without this
    @Override
    public void initGui() {
        super.initGui();
    }


    //I think this will be for the key bind, maybe.
    @Override
    protected void keyTyped(char typedChar, int keyCode) throws IOException {
        super.keyTyped(typedChar, keyCode);
    }


    //Pausing the game is for chumps.
    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
