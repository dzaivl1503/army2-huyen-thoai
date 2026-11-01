package tab.tab4;

import screen.Main;

import javax.microedition.lcdui.Graphics;

/**
 * Ban phim ao Army 2 cho man hinh cam ung.
 * Hang tren : F1 , UP (^) , LUC MAX , F2
 * Hang duoi : LEFT (<) , DOWN (v) , RIGHT (>) , OK
 * Cac nut keypress co mau trang va vien xanh cyan giong mau thiet ke.
 */
public class ArmyKeypad {

    public static ArmyKeypad instance;

    public static final int ROW_HEIGHT = Main.KEYPAD_TOTAL_HEIGHT / 2;
    public static final int KEYPAD_TOTAL_HEIGHT = Main.KEYPAD_TOTAL_HEIGHT; // 300px (150px moi hang)

    public static class KeyButton {
        public int x, y, w, h;
        public String label;
        public int keycode;
        public int type; // 0: text, 1: UP (^), 2: DOWN (v), 3: LEFT (<), 4: RIGHT (>), 6: LUC MAX
        public boolean pressed;

        public KeyButton(String label, int keycode, int type) {
            this.label = label;
            this.keycode = keycode;
            this.type = type;
        }

        public boolean contains(int px, int py) {
            return px >= x && px < x + w && py >= y && py < y + h;
        }
    }

    public boolean isVisible = true;

    // Hang 1 (tren): [F1] [^] [LUC MAX] [F2]
    public final KeyButton btnF1 = new KeyButton("F1", -6, 0);
    public final KeyButton btnUp = new KeyButton("^", -1, 1);
    public final KeyButton btnLucMax = new KeyButton("LUC MAX", -5, 6);
    public final KeyButton btnF2 = new KeyButton("F2", -7, 0);

    // Hang 2 (duoi): [<] [v] [>] [OK]
    public final KeyButton btnLeft = new KeyButton("<", -3, 3);
    public final KeyButton btnDown = new KeyButton("v", -2, 2);
    public final KeyButton btnRight = new KeyButton(">", -4, 4);
    public final KeyButton btnOk = new KeyButton("OK", -5, 0);

    public final KeyButton[][] grid = new KeyButton[][] {
        { btnF1, btnUp, btnLucMax, btnF2 },
        { btnLeft, btnDown, btnRight, btnOk }
    };

    public ArmyKeypad() {
        instance = this;
        updatePosition(Main.getWidth(), Main.getHeight());
    }

    public void updatePosition(int screenWidth, int screenHeight) {
        if (screenWidth <= 0) screenWidth = Main.getWidth();
        if (screenHeight <= 0) screenHeight = Main.getHeight();
        if (screenWidth <= 0) screenWidth = 380;
        if (screenHeight <= 0) screenHeight = 680;

        int startY = screenHeight - KEYPAD_TOTAL_HEIGHT;
        int rowH = KEYPAD_TOTAL_HEIGHT / 2;
        int colW = screenWidth / 4;

        for (int row = 0; row < 2; row++) {
            int curY = startY + row * rowH;
            for (int col = 0; col < 4; col++) {
                KeyButton btn = grid[row][col];
                btn.x = col * colW;
                btn.y = curY;
                btn.w = (col == 3) ? (screenWidth - btn.x) : colW;
                btn.h = (row == 1) ? (screenHeight - curY) : rowH;
            }
        }
    }

    public void paint(Graphics graphics) {
        if (!isVisible || graphics == null) {
            return;
        }

        int w = Main.getWidth();
        int h = Main.getHeight();
        int startY = h - KEYPAD_TOTAL_HEIGHT;
        int rowH = KEYPAD_TOTAL_HEIGHT / 2;
        int colW = w / 4;

        // 1. Ve nen toan bo ban phim mau trang (0xFFFFFF)
        graphics.setColor(0xFFFFFF);
        graphics.fillRect(0, startY, w, KEYPAD_TOTAL_HEIGHT);

        // 2. Ve tung nut
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 4; col++) {
                paintButton(graphics, grid[row][col]);
            }
        }

        // 3. Ve cac duong vien chia cach giua cac nut bang mau xanh cyan nhe (0x56CCF2)
        graphics.setColor(0x56CCF2);

        // Duong vien tren ngan cach voi Game
        graphics.drawLine(0, startY, w, startY);

        // Duong vien ngang giua hang 1 va hang 2
        graphics.drawLine(0, startY + rowH, w, startY + rowH);

        // Cac duong vien doc ngan cach 4 cot
        for (int c = 1; c < 4; c++) {
            int cx = c * colW;
            graphics.drawLine(cx, startY, cx, startY + KEYPAD_TOTAL_HEIGHT);
        }
    }

    private void paintButton(Graphics graphics, KeyButton btn) {
        int bx = btn.x;
        int by = btn.y;
        int bw = btn.w;
        int bh = btn.h;
        boolean p = btn.pressed;

        // Mau nen: Trang tinh khiet (0xFFFFFF), khi nhan thi sang nhe (0xEDF2F7)
        graphics.setColor(p ? 0xEDF2F7 : 0xFFFFFF);
        graphics.fillRect(bx, by, bw, bh);

        // Duong vien quanh nut mau xanh cyan (0x56CCF2)
        graphics.setColor(0x56CCF2);
        graphics.drawRect(bx, by, bw, bh);

        int offset = p ? 1 : 0;
        int cx = bx + bw / 2;
        int cy = by + bh / 2 + offset;

        // Ve nhan nut (chu mau vang vien den cua font viet hoa client: FontRenderer.f)
        if (btn.type == 0 || btn.type == 6) {
            // F1, LỰC MAX, F2, OK dung font chu viet hoa cua client (FontRenderer.f)
            FontRenderer font = (FontRenderer.f != null) ? FontRenderer.f : FontRenderer.b;
            if (font != null) {
                String text = btn.label.toUpperCase();
                int ty = cy - (font.a() / 2);
                font.a(graphics, text, cx, ty, 2);
            } else {
                graphics.setColor(0xFFA500);
                graphics.drawString(btn.label.toUpperCase(), cx, cy, Graphics.HCENTER | Graphics.VCENTER);
            }
        } else if (btn.type == 1) {
            // UP (^)
            drawSymbolUp(graphics, cx, cy);
        } else if (btn.type == 2) {
            // DOWN (v)
            drawSymbolDown(graphics, cx, cy);
        } else if (btn.type == 3) {
            // LEFT (<)
            drawSymbolLeft(graphics, cx, cy);
        } else if (btn.type == 4) {
            // RIGHT (>)
            drawSymbolRight(graphics, cx, cy);
        }
    }

    private void drawSymbolUp(Graphics graphics, int cx, int cy) {
        graphics.setColor(0x000000);
        for (int t = 0; t <= 2; t++) {
            graphics.drawLine(cx - 10, cy + 5 + t, cx, cy - 6 + t);
            graphics.drawLine(cx, cy - 6 + t, cx + 10, cy + 5 + t);
        }
    }

    private void drawSymbolDown(Graphics graphics, int cx, int cy) {
        graphics.setColor(0x000000);
        for (int t = 0; t <= 2; t++) {
            graphics.drawLine(cx - 10, cy - 5 + t, cx, cy + 6 + t);
            graphics.drawLine(cx, cy + 6 + t, cx + 10, cy - 5 + t);
        }
    }

    private void drawSymbolLeft(Graphics graphics, int cx, int cy) {
        graphics.setColor(0x000000);
        for (int t = 0; t <= 2; t++) {
            graphics.drawLine(cx + 5 + t, cy - 10, cx - 6 + t, cy);
            graphics.drawLine(cx - 6 + t, cy, cx + 5 + t, cy + 10);
        }
    }

    private void drawSymbolRight(Graphics graphics, int cx, int cy) {
        graphics.setColor(0x000000);
        for (int t = 0; t <= 2; t++) {
            graphics.drawLine(cx - 5 + t, cy - 10, cx + 6 + t, cy);
            graphics.drawLine(cx + 6 + t, cy, cx - 5 + t, cy + 10);
        }
    }

    public boolean onTouchDown(int x, int y) {
        if (!isVisible) {
            return false;
        }

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 4; col++) {
                KeyButton btn = grid[row][col];
                if (btn.contains(x, y)) {
                    btn.pressed = true;
                    if (btn.type == 6) {
                        // LUC MAX: Hien thi hop thoai nhap luc ban
                        try {
                            new ActionListener130().a();
                        } catch (Throwable t) {
                            t.printStackTrace();
                        }
                    } else {
                        triggerKeyDown(btn.keycode);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onTouchUp(int x, int y) {
        if (!isVisible) {
            return false;
        }

        boolean handled = false;
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 4; col++) {
                KeyButton btn = grid[row][col];
                if (btn.pressed) {
                    btn.pressed = false;
                    if (btn.type != 6) {
                        triggerKeyUp(btn.keycode);
                    }
                    handled = true;
                }
            }
        }
        return handled;
    }

    public boolean onTouchDragged(int x, int y) {
        if (!isVisible) {
            return false;
        }

        boolean anyPressed = false;
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 4; col++) {
                KeyButton btn = grid[row][col];
                if (btn.pressed) {
                    if (!btn.contains(x, y)) {
                        btn.pressed = false;
                        if (btn.type != 6) {
                            triggerKeyUp(btn.keycode);
                        }
                    } else {
                        anyPressed = true;
                    }
                } else if (btn.contains(x, y)) {
                    btn.pressed = true;
                    if (btn.type == 6) {
                        try {
                            new ActionListener130().a();
                        } catch (Throwable t) {
                            t.printStackTrace();
                        }
                    } else {
                        triggerKeyDown(btn.keycode);
                    }
                    anyPressed = true;
                }
            }
        }
        return anyPressed;
    }

    private void triggerKeyDown(int keycode) {
        if (ArmyTab.instance != null && ArmyTab.instance.gameCanvas != null) {
            ArmyTab.instance.gameCanvas.keyPressed(keycode);
        } else if (GameCanvas.var_game_GameCanvas_a != null) {
            GameCanvas.var_game_GameCanvas_a.keyPressed(keycode);
        }
    }

    private void triggerKeyUp(int keycode) {
        if (ArmyTab.instance != null && ArmyTab.instance.gameCanvas != null) {
            ArmyTab.instance.gameCanvas.keyReleased(keycode);
        } else if (GameCanvas.var_game_GameCanvas_a != null) {
            GameCanvas.var_game_GameCanvas_a.keyReleased(keycode);
        }
    }
}