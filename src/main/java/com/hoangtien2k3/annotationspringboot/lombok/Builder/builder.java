package com.hoangtien2k3.annotationspringboot.lombok.Builder;

import lombok.Builder;

@Builder
public class builder {
    private final String name;
    private final int id;
}

//    builder testWidget = builder.builder()
//            .name("foo")
//            .id(1)
//            .build();
//
//    assertThat(testWidget.getName())
//        .isEqualTo("foo");
//        assertThat(testWidget.getId())
//        .isEqualTo(1);