package com.metacoding.projectwc.worldcup;

import lombok.Data;

public class WorldcupResponse {

    @Data
    public static class findByIDDTO {
        private int id;
        private String title;
        private String description;

        public findByIDDTO(Worldcup worldcup) {
            this.id = worldcup.getId();
            this.title = worldcup.getTitle();
            this.description = worldcup.getDescription();
        }
    }
}
