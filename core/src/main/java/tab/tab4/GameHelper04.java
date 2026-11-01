/*
 * Decompiled with CFR 0.152.
 */
package tab.tab4;


final class GameHelper04
implements Runnable {
    private GameSetting III11II1Il;

    GameHelper04(GameSetting gameSetting) {
        this.III11II1Il = gameSetting;
    }

    public final void run() {
        try {
            GameCanvas.void_a(StringUtils.dX());
            TerrainMidlet.fetchAndSaveServerList();
            GameCanvas.d();
            this.III11II1Il.var_byte_a = (byte)4;
            this.III11II1Il.g = new GameCommand(StringUtils.dF(), new ActionListener082(this.III11II1Il));
            this.III11II1Il.f = new GameCommand(StringUtils.dJ(), new ActionListener177());
            this.III11II1Il.h = new GameCommand(StringUtils.dH(), new ActionListener209(this.III11II1Il));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

