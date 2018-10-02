package com.greenfoxacademy.restexercises.MainRestControllerTests;

import com.greenfoxacademy.restexercises.controllers.MainRestController;
import com.greenfoxacademy.restexercises.repositories.LogRepository;
import com.greenfoxacademy.restexercises.services.ArrayHandlerService;
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
@WebMvcTest(MainRestController.class)
public class MainRestControllerTest {
  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private ArrayHandlerService arrayHandlerService;

  @MockBean
  LogRepository logRepository;


  @Test
  public void doublingShouldReturnProperResult_when_inputIsGiven() throws Exception {
    int input = 15;
    int result = 30;

    mockMvc.perform(get("/doubling?input=" + input))
        .andExpect(status().isCreated())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.received", is(input)))
        .andExpect(jsonPath("$.result", is(result)))
        .andDo(print());
  }

  @Test
  public void doublingShouldReturnError_when_noInput() throws Exception {

    mockMvc.perform(get("/doubling"))
        .andExpect(status().isNotAcceptable())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.error", is("Please provide an input!")))
        .andDo(print());
  }

  @Test
  public void greeterShouldGreat_when_NameAndTitleIsGiven() throws Exception {
    String name = "Petike";
    String title = "student";

    mockMvc.perform(get("/greeter?name=" + name + "&title=" + title))
        .andExpect(status().isCreated())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.welcome_message", is("Oh, hi there " + name + ", my dear " + title + "!")))
        .andDo(print());
  }

}
