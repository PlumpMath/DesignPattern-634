package com.company;

/**
 * Created by nightwingky on 16-9-14.
 */
public class HairFactory {

    public HairInterface getHair(String key) {
        if("left".equals(key)) {
            return new LeftHair();
        } else if("right".equals(key)) {
            return new RightHair();
        } else {
            return null;
        }
    }

    public HairInterface getHairByClass(String className) {
        try {
            HairInterface hairInterface = (HairInterface) Class.forName(className).newInstance();
            return hairInterface;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
