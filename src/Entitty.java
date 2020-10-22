public abstract class Entitty {
    public static int PolA;
    public static int polB;
    public static int velx;
    public static int vely;

    public static boolean colliding(String typ) throws Exception {
        switch (typ) {
            case "SWall":
                if (Varel.polB < Wall.polB || Player.polB < Wall.polB) {
                    return true;
                } else {
                    return false;
                }
            case "Varel":
                if (Varel.PolA < Player.PolA + Player.velx &&
                        Varel.PolA + Varel.velx > Player.PolA &&
                        Varel.polB < Player.polB + Player.vely &&
                        Varel.polB + Varel.vely > Player.polB) {
                    return true;
                } else {
                    return false;
                }
            case "Player":
                if (Player.PolA < Varel.PolA + Varel.velx &&
                        Player.PolA + Player.velx > Varel.PolA &&
                        Player.polB < Varel.polB + Varel.vely &&
                        Player.polB + Player.vely > Varel.polB) {
                    return true;
                } else {
                    return false;
                }
            default:
                throw new Exception("no parameter given");
        }
    }

    public static enum type {
        Player, Obstacle
    }
}