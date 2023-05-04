package Explorers;

import Planets.*;

public class RobotExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Bounce nako tol sa Mercury");
    }
    @Override
    public void visit(Venus venus) {
        System.out.println("Bounce nako tol sa Venus");
    }
    @Override
    public void visit(Earth earth) {
        System.out.println("Bounce nako tol sa Earth");
    }
    @Override
    public void visit(Mars mars) {
        System.out.println("Bounce nako tol sa Mars");
    }
    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Bounce nako tol sa Jupiter");
    }
    @Override
    public void visit(Saturn saturn) {
        System.out.println("Bounce nako tol sa Saturn");
    }
    @Override
    public void visit(Uranus uranus) {
        System.out.println("Bounce nako tol sa Uranus");
    }
   @Override
    public void visit(Neptune neptune) {
        System.out.println("Bounce nako tol sa Neptune");
    }

}