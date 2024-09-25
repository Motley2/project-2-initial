package com.csc205.project2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConeTest {

    private Cone cone;

    @BeforeEach
    public void setUp() {
        cone = new Cone(3.0, 2.0);
    }

    @Test
    public void testGetHeight() {
        assertEquals(3.0, cone.getHeight());
    }

    @Test
    public void testSetHeight() {
        cone.setHeight(4.0);
        assertEquals(4.0, cone.getHeight());
    }

    @Test
    public void testGetRadius() {
        assertEquals(2.0, cone.getRadius());
    }

    @Test
    public void testSetRadius() {
        cone.setRadius(3.0);
        assertEquals(3.0, cone.getRadius());
    }

    @Test
    public void testSurfaceArea() {
        assertEquals(35.22071741263713, cone.surfaceArea(), 0.0001);
    }

    @Test
    public void testVolume() {
        assertEquals(12.566370614359172, cone.volume(), 0.0001);
    }

    @Test
    public void testToString() {
        String expected = "Cone { height = 3.0, radius = 2.0, surface area = 35.22071741263713, volume = 12.566370614359172}";
        assertEquals(expected, cone.toString());
    }
}