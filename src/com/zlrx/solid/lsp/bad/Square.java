package com.zlrx.solid.lsp.bad;

public class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHight(width);
    }

    @Override
    public void setHight(int hight) {
        super.setHight(hight);
        super.setWidth(hight);
    }
}
