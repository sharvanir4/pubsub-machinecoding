Requirements:


- Services/publishers can publish messages to topics
- Subscribers can read and process messages in a pull-based fashion
- API to create topics, publisher to write messages into them and subscribers to subscribe, consume and unsubscribe
- Maintain state of consumption of each message in each topic for each subscriber
- Maintain order of message consumption from a topic for each subscriber

Run:


- Use the demo class and verify if the messages are consumed by each subscription ID in order from both publishers.

Demo output: (view the plain readme)


Subscriber subscriber1 subscribed to topic SportsTopic with subscription id 0a8a8360-9b0a-4cd2-8824-ea448c5f0773
Subscriber subscriber2 subscribed to topic SportsTopic with subscription id be426b79-b805-4a58-b2fc-f1289646d301
Subscriber subscriber1 subscribed to topic NewsTopic with subscription id d38167c7-c7e2-49db-8380-a542b72ccdc2
Subscriber subscriber2 subscribed to topic NewsTopic with subscription id 030c6c95-e89e-4033-9c9a-d9cd53ec50ca
Published 7b08683c-cbcd-4a40-86e3-98d25f18ae75 with payload News update #21 to topic NewsTopic
Published e7b42995-948c-44f3-9f0b-677b4b4eb45f with payload Sports update #1 to topic SportsTopic
Published b21647da-ab08-4f2c-8ce2-5abd07a79d4c with payload News update #22 to topic NewsTopic
Published 587b94c3-9d3a-47b7-976f-dfc869fd38af with payload Sports update #2 to topic SportsTopic
Consumed 2 messages from subscription be426b79-b805-4a58-b2fc-f1289646d301
Consumed 2 messages from subscription d38167c7-c7e2-49db-8380-a542b72ccdc2
Consumed 2 messages from subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca
Consumed 2 messages from subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773
Polled message e7b42995-948c-44f3-9f0b-677b4b4eb45f for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #1 and metadata {publisher=publisher1}
Polled message 587b94c3-9d3a-47b7-976f-dfc869fd38af for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #2 and metadata {publisher=publisher2}
Polled message e7b42995-948c-44f3-9f0b-677b4b4eb45f for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #1 and metadata {publisher=publisher1}
Polled message 587b94c3-9d3a-47b7-976f-dfc869fd38af for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #2 and metadata {publisher=publisher2}
Polled message 7b08683c-cbcd-4a40-86e3-98d25f18ae75 for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #21 and metadata {publisher=publisher1}
Polled message b21647da-ab08-4f2c-8ce2-5abd07a79d4c for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #22 and metadata {publisher=publisher2}
Polled message 7b08683c-cbcd-4a40-86e3-98d25f18ae75 for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #21 and metadata {publisher=publisher1}
Polled message b21647da-ab08-4f2c-8ce2-5abd07a79d4c for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #22 and metadata {publisher=publisher2}
Published 1b7a0d1a-ebd2-445f-8401-23cbaddc9ff5 with payload News update #23 to topic NewsTopic
Published 30be0cc8-4f92-4fa2-b17c-313f0751a028 with payload News update #24 to topic NewsTopic
Consumed 2 messages from subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca
Polled message 1b7a0d1a-ebd2-445f-8401-23cbaddc9ff5 for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #23 and metadata {publisher=publisher1}
Polled message 30be0cc8-4f92-4fa2-b17c-313f0751a028 for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #24 and metadata {publisher=publisher2}
Consumed 2 messages from subscription d38167c7-c7e2-49db-8380-a542b72ccdc2
Polled message 1b7a0d1a-ebd2-445f-8401-23cbaddc9ff5 for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #23 and metadata {publisher=publisher1}
Polled message 30be0cc8-4f92-4fa2-b17c-313f0751a028 for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #24 and metadata {publisher=publisher2}
Published 9a413db7-c6ce-4bc6-ae73-3464eee2d660 with payload Sports update #3 to topic SportsTopic
Published b90ff87b-a8b4-44db-a7cc-81bf6d46021a with payload Sports update #4 to topic SportsTopic
Consumed 2 messages from subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773
Polled message 9a413db7-c6ce-4bc6-ae73-3464eee2d660 for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #3 and metadata {publisher=publisher1}
Polled message b90ff87b-a8b4-44db-a7cc-81bf6d46021a for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #4 and metadata {publisher=publisher2}
Consumed 2 messages from subscription be426b79-b805-4a58-b2fc-f1289646d301
Polled message 9a413db7-c6ce-4bc6-ae73-3464eee2d660 for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #3 and metadata {publisher=publisher1}
Polled message b90ff87b-a8b4-44db-a7cc-81bf6d46021a for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #4 and metadata {publisher=publisher2}
Published 23551a79-cd03-4c20-b12a-511afd9f2bc6 with payload News update #25 to topic NewsTopic
Published f51c44d6-2e74-4f40-904f-c409ab02780f with payload News update #26 to topic NewsTopic
Consumed 2 messages from subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca
Polled message 23551a79-cd03-4c20-b12a-511afd9f2bc6 for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #25 and metadata {publisher=publisher1}
Polled message f51c44d6-2e74-4f40-904f-c409ab02780f for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #26 and metadata {publisher=publisher2}
Consumed 2 messages from subscription d38167c7-c7e2-49db-8380-a542b72ccdc2
Polled message 23551a79-cd03-4c20-b12a-511afd9f2bc6 for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #25 and metadata {publisher=publisher1}
Polled message f51c44d6-2e74-4f40-904f-c409ab02780f for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #26 and metadata {publisher=publisher2}
Published 2043df7e-ffc8-4713-a341-63de067ea4f2 with payload News update #27 to topic NewsTopic
Published 7228a474-a077-4d20-9129-5d6ecb7b5492 with payload News update #28 to topic NewsTopic
Published 17a5eed6-5612-4d39-acc8-23c745256e1a with payload Sports update #5 to topic SportsTopic
Published 5222924a-e306-483f-80a6-40a53a19e197 with payload Sports update #6 to topic SportsTopic
Consumed 2 messages from subscription be426b79-b805-4a58-b2fc-f1289646d301
Polled message 17a5eed6-5612-4d39-acc8-23c745256e1a for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #5 and metadata {publisher=publisher1}
Polled message 5222924a-e306-483f-80a6-40a53a19e197 for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #6 and metadata {publisher=publisher2}
Consumed 2 messages from subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca
Consumed 2 messages from subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773
Polled message 17a5eed6-5612-4d39-acc8-23c745256e1a for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #5 and metadata {publisher=publisher1}
Polled message 5222924a-e306-483f-80a6-40a53a19e197 for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #6 and metadata {publisher=publisher2}
Polled message 2043df7e-ffc8-4713-a341-63de067ea4f2 for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #27 and metadata {publisher=publisher1}
Polled message 7228a474-a077-4d20-9129-5d6ecb7b5492 for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #28 and metadata {publisher=publisher2}
Consumed 2 messages from subscription d38167c7-c7e2-49db-8380-a542b72ccdc2
Polled message 2043df7e-ffc8-4713-a341-63de067ea4f2 for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #27 and metadata {publisher=publisher1}
Polled message 7228a474-a077-4d20-9129-5d6ecb7b5492 for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #28 and metadata {publisher=publisher2}
Published b7a10924-53ad-4007-a12c-93a351b8f993 with payload News update #29 to topic NewsTopic
Published 3143c93e-682d-4554-a0b3-abc95d06253c with payload News update #30 to topic NewsTopic
Consumed 2 messages from subscription d38167c7-c7e2-49db-8380-a542b72ccdc2
Polled message b7a10924-53ad-4007-a12c-93a351b8f993 for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #29 and metadata {publisher=publisher1}
Polled message 3143c93e-682d-4554-a0b3-abc95d06253c for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #30 and metadata {publisher=publisher2}
Consumed 2 messages from subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca
Polled message b7a10924-53ad-4007-a12c-93a351b8f993 for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #29 and metadata {publisher=publisher1}
Polled message 3143c93e-682d-4554-a0b3-abc95d06253c for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #30 and metadata {publisher=publisher2}
Published 6af61bdf-4637-4dee-83d7-fbd9545cd815 with payload Sports update #7 to topic SportsTopic
Published 04e26436-1683-4710-bf63-22fe470d7357 with payload Sports update #8 to topic SportsTopic
Published b22a9c1d-0b08-410e-8d7b-dcdeb29dc7d8 with payload News update #31 to topic NewsTopic
Published d0c3d204-c47a-4865-b039-789a0a2abf0f with payload News update #32 to topic NewsTopic
Consumed 2 messages from subscription be426b79-b805-4a58-b2fc-f1289646d301
Polled message 6af61bdf-4637-4dee-83d7-fbd9545cd815 for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #7 and metadata {publisher=publisher1}
Consumed 2 messages from subscription d38167c7-c7e2-49db-8380-a542b72ccdc2
Polled message b22a9c1d-0b08-410e-8d7b-dcdeb29dc7d8 for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #31 and metadata {publisher=publisher1}
Polled message d0c3d204-c47a-4865-b039-789a0a2abf0f for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #32 and metadata {publisher=publisher2}
Polled message 04e26436-1683-4710-bf63-22fe470d7357 for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #8 and metadata {publisher=publisher2}
Consumed 2 messages from subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773
Polled message 6af61bdf-4637-4dee-83d7-fbd9545cd815 for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #7 and metadata {publisher=publisher1}
Polled message 04e26436-1683-4710-bf63-22fe470d7357 for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #8 and metadata {publisher=publisher2}
Consumed 2 messages from subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca
Polled message b22a9c1d-0b08-410e-8d7b-dcdeb29dc7d8 for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #31 and metadata {publisher=publisher1}
Polled message d0c3d204-c47a-4865-b039-789a0a2abf0f for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #32 and metadata {publisher=publisher2}
Published 0ac4af23-ec53-403d-b08f-37e252b5e431 with payload News update #33 to topic NewsTopic
Published 423bb827-defb-4634-8e24-be0f62ceab70 with payload News update #34 to topic NewsTopic
Consumed 2 messages from subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca
Consumed 2 messages from subscription d38167c7-c7e2-49db-8380-a542b72ccdc2
Polled message 0ac4af23-ec53-403d-b08f-37e252b5e431 for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #33 and metadata {publisher=publisher1}
Polled message 423bb827-defb-4634-8e24-be0f62ceab70 for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #34 and metadata {publisher=publisher2}
Polled message 0ac4af23-ec53-403d-b08f-37e252b5e431 for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #33 and metadata {publisher=publisher1}
Polled message 423bb827-defb-4634-8e24-be0f62ceab70 for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #34 and metadata {publisher=publisher2}
Published 076ca6ef-2de4-4837-96f9-ec6ddbf1e7b8 with payload Sports update #9 to topic SportsTopic
Published 8c276dcd-cee7-47da-836f-fe400889353d with payload Sports update #10 to topic SportsTopic
Consumed 2 messages from subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773
Polled message 076ca6ef-2de4-4837-96f9-ec6ddbf1e7b8 for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #9 and metadata {publisher=publisher1}
Polled message 8c276dcd-cee7-47da-836f-fe400889353d for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #10 and metadata {publisher=publisher2}
Consumed 2 messages from subscription be426b79-b805-4a58-b2fc-f1289646d301
Polled message 076ca6ef-2de4-4837-96f9-ec6ddbf1e7b8 for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #9 and metadata {publisher=publisher1}
Polled message 8c276dcd-cee7-47da-836f-fe400889353d for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #10 and metadata {publisher=publisher2}
Published be8cf82f-36b4-4d14-a4ef-8b4579ab231c with payload News update #35 to topic NewsTopic
Published a066d2a9-da07-4a30-ad11-b476b85d99f4 with payload News update #36 to topic NewsTopic
Consumed 2 messages from subscription d38167c7-c7e2-49db-8380-a542b72ccdc2
Polled message be8cf82f-36b4-4d14-a4ef-8b4579ab231c for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #35 and metadata {publisher=publisher1}
Consumed 2 messages from subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca
Polled message be8cf82f-36b4-4d14-a4ef-8b4579ab231c for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #35 and metadata {publisher=publisher1}
Polled message a066d2a9-da07-4a30-ad11-b476b85d99f4 for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #36 and metadata {publisher=publisher2}
Polled message a066d2a9-da07-4a30-ad11-b476b85d99f4 for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #36 and metadata {publisher=publisher2}
Published e72957c0-4ff9-450d-ba8f-3fba6490ed1a with payload Sports update #11 to topic SportsTopic
Published 6fc0384a-4040-4929-86be-a6673676c776 with payload Sports update #12 to topic SportsTopic
Consumed 2 messages from subscription be426b79-b805-4a58-b2fc-f1289646d301
Polled message e72957c0-4ff9-450d-ba8f-3fba6490ed1a for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #11 and metadata {publisher=publisher1}
Polled message 6fc0384a-4040-4929-86be-a6673676c776 for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #12 and metadata {publisher=publisher2}
Published 0c27bca6-f3b1-4b22-9248-e47ef7830088 with payload News update #37 to topic NewsTopic
Published fd136450-57d5-4ab2-89d4-5a103d7eb7cd with payload News update #38 to topic NewsTopic
Consumed 2 messages from subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773
Polled message e72957c0-4ff9-450d-ba8f-3fba6490ed1a for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #11 and metadata {publisher=publisher1}
Polled message 6fc0384a-4040-4929-86be-a6673676c776 for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #12 and metadata {publisher=publisher2}
Consumed 2 messages from subscription d38167c7-c7e2-49db-8380-a542b72ccdc2
Polled message 0c27bca6-f3b1-4b22-9248-e47ef7830088 for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #37 and metadata {publisher=publisher1}
Polled message fd136450-57d5-4ab2-89d4-5a103d7eb7cd for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #38 and metadata {publisher=publisher2}
Consumed 2 messages from subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca
Polled message 0c27bca6-f3b1-4b22-9248-e47ef7830088 for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #37 and metadata {publisher=publisher1}
Polled message fd136450-57d5-4ab2-89d4-5a103d7eb7cd for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #38 and metadata {publisher=publisher2}
Published 0ad5a9b1-284b-45dc-acf4-cb6efca63d25 with payload News update #39 to topic NewsTopic
Published 81ea9bb1-af1e-49c5-b1c6-88b8d1116074 with payload News update #40 to topic NewsTopic
Consumed 2 messages from subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca
Consumed 2 messages from subscription d38167c7-c7e2-49db-8380-a542b72ccdc2
Polled message 0ad5a9b1-284b-45dc-acf4-cb6efca63d25 for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #39 and metadata {publisher=publisher1}
Polled message 81ea9bb1-af1e-49c5-b1c6-88b8d1116074 for subscription d38167c7-c7e2-49db-8380-a542b72ccdc2 with payload News update #40 and metadata {publisher=publisher2}
Polled message 0ad5a9b1-284b-45dc-acf4-cb6efca63d25 for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #39 and metadata {publisher=publisher1}
Polled message 81ea9bb1-af1e-49c5-b1c6-88b8d1116074 for subscription 030c6c95-e89e-4033-9c9a-d9cd53ec50ca with payload News update #40 and metadata {publisher=publisher2}
Published 2674f3b4-2c33-4163-a896-37838de34707 with payload Sports update #13 to topic SportsTopic
Published 0b6c9291-bf33-47b9-91ea-1a02489449bb with payload Sports update #14 to topic SportsTopic
Consumed 2 messages from subscription be426b79-b805-4a58-b2fc-f1289646d301
Polled message 2674f3b4-2c33-4163-a896-37838de34707 for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #13 and metadata {publisher=publisher1}
Polled message 0b6c9291-bf33-47b9-91ea-1a02489449bb for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #14 and metadata {publisher=publisher2}
Consumed 2 messages from subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773
Polled message 2674f3b4-2c33-4163-a896-37838de34707 for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #13 and metadata {publisher=publisher1}
Polled message 0b6c9291-bf33-47b9-91ea-1a02489449bb for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #14 and metadata {publisher=publisher2}
Published 19e48302-aee8-41ce-83ff-94f9d6fd4323 with payload Sports update #15 to topic SportsTopic
Published 63a7b50e-c2be-4793-aa8d-f790e6c9ef14 with payload Sports update #16 to topic SportsTopic
Consumed 2 messages from subscription be426b79-b805-4a58-b2fc-f1289646d301
Polled message 19e48302-aee8-41ce-83ff-94f9d6fd4323 for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #15 and metadata {publisher=publisher1}
Polled message 63a7b50e-c2be-4793-aa8d-f790e6c9ef14 for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #16 and metadata {publisher=publisher2}
Consumed 2 messages from subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773
Polled message 19e48302-aee8-41ce-83ff-94f9d6fd4323 for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #15 and metadata {publisher=publisher1}
Polled message 63a7b50e-c2be-4793-aa8d-f790e6c9ef14 for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #16 and metadata {publisher=publisher2}
Published 3942cbd7-5afb-49ea-8a15-145ae24b151f with payload Sports update #17 to topic SportsTopic
Published 7ecf17ac-ad32-484e-806f-9fc9e1871045 with payload Sports update #18 to topic SportsTopic
Consumed 2 messages from subscription be426b79-b805-4a58-b2fc-f1289646d301
Polled message 3942cbd7-5afb-49ea-8a15-145ae24b151f for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #17 and metadata {publisher=publisher1}
Consumed 2 messages from subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773
Polled message 7ecf17ac-ad32-484e-806f-9fc9e1871045 for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #18 and metadata {publisher=publisher2}
Polled message 3942cbd7-5afb-49ea-8a15-145ae24b151f for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #17 and metadata {publisher=publisher1}
Polled message 7ecf17ac-ad32-484e-806f-9fc9e1871045 for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #18 and metadata {publisher=publisher2}
Published fcd458f1-7900-4404-8426-b3fdccdbebca with payload Sports update #19 to topic SportsTopic
Published ee052e1b-fdc6-4528-ad75-026648d1009e with payload Sports update #20 to topic SportsTopic
Consumed 2 messages from subscription be426b79-b805-4a58-b2fc-f1289646d301
Consumed 2 messages from subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773
Polled message fcd458f1-7900-4404-8426-b3fdccdbebca for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #19 and metadata {publisher=publisher1}
Polled message fcd458f1-7900-4404-8426-b3fdccdbebca for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #19 and metadata {publisher=publisher1}
Polled message ee052e1b-fdc6-4528-ad75-026648d1009e for subscription be426b79-b805-4a58-b2fc-f1289646d301 with payload Sports update #20 and metadata {publisher=publisher2}
Polled message ee052e1b-fdc6-4528-ad75-026648d1009e for subscription 0a8a8360-9b0a-4cd2-8824-ea448c5f0773 with payload Sports update #20 and metadata {publisher=publisher2}
