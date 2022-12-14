package com.mashibing.tank.util;

import test.ImageIo;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ResourceMgr {
    public static BufferedImage tankdImg, buillterdImg, tanklImg, tankrImg, tankuImg, buillterlImg, buillterrImg, buillteruImg, myTank,myTanklImg,myTankrImg,myTankdImg;
    static {
        try {
            myTank = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/GoodTank1.png"));
            myTanklImg = ImageUtil.rotateImage(myTank, -90);
            myTankrImg = ImageUtil.rotateImage(myTank, 90);
            myTankdImg = ImageUtil.rotateImage(myTank, -180);
            tankdImg = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/tankD.gif"));
            tanklImg = ImageUtil.rotateImage(tankdImg, 90);
            tankrImg = ImageUtil.rotateImage(tankdImg, -90);
            tankuImg = ImageUtil.rotateImage(tankdImg, -180);
            buillterdImg = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/bulletD.gif"));
            buillterlImg = ImageUtil.rotateImage(buillterdImg, 90);
            buillterrImg = ImageUtil.rotateImage(buillterdImg, -90);
            buillteruImg = ImageUtil.rotateImage(buillterdImg, -180);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
