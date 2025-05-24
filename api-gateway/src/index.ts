import App from '@app';

import { env } from '@lib/env';

const port = env.PORT;
const app = new App(port);

app.listen();
