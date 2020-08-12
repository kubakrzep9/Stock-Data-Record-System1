Feature: Valid POST Requests
    Scenario: The user makes a successful POST Request to the MorningPanic API
        When the following JSON response is sent
        """
        {
            "symbol" : "UAVS",
            "sector" : "Drone",
            "history_length" : 5,
            "date" : "2020-07-10",
            "drop_point" : 1.62,
            "drop_time" : "8:30",
            "bottom_tick" : 1.55,
            "bottom_time" : "8:36",
            "top_tick" : 1.75,
            "top_time" : "8:41",
            "premarket_high" : 1.65,
            "premarket_high_time" : "00:00",
            "premarket_low_after_high" : 1.59,
            "premarket_low_after_high_time" : "00:00"
        }
        """
        Then the response code is 201
        And the body is "Success"