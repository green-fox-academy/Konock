package com.greenfoxacademy.groot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {
  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void grootShouldReturnIAmGroot_when_inputIsSomemessage() throws Exception {
    String input = "somemessage";

    mockMvc.perform(get("/groot?message=" + input))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.translated", is("I am Groot!")))
        .andDo(print());
  }

  @Test
  public void grootShouldReturnError_when_inputIsNotGiven() throws Exception {
    mockMvc.perform(get("/groot"))
        .andExpect(status().isBadRequest())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.error", is("I am Groot!")))
        .andDo(print());
  }
}
