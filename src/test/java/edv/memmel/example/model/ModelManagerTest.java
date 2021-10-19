package edv.memmel.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ModelManagerTest {

  private ModelManager modelManager;

  @BeforeEach
  void setUp() {
    modelManager = new ModelManager();
  }

  @Test
  void sampleMethod() {
    Assertions.assertTrue(modelManager.sampleMethod());
  }
}