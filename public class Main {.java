public class Main {
}
///This will be the main game file///

private Controller c;

public void init(){
    ///Main game files///

    c = new Controller(this);
}

private void tick(){
    ///More things///

    c.tick();
}

private void render(){
    ///More main game files///

    c.render(g);
}

public void keyPressed(KeyEvent e){
    ///more in-game files///

    int key = e.getKeyCode();
    ///...///

    if(key == KeyEvent.VK_SPACE){
        c.addBullet(new Bullet(p.getX(), p.getY(), this));
    }
}