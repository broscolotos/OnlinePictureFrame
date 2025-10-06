package com.creativemd.opf.packet;

import com.creativemd.opf.OPFrame;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

public class PacketImageStream implements IMessage {

    @Override //image id, image size, image
    public void fromBytes(ByteBuf buf) {
        int length = buf.readInt();
        byte[] imgBytes = new byte[length];
        buf.readBytes(imgBytes);
        try {
            BufferedImage img = ImageIO.read(new ByteArrayInputStream(imgBytes));
            File file = new File(OPFrame.configDirectory)
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override //image id, image size, image
    public void toBytes(ByteBuf buf) {

    }
}
