import { StatusCodes } from 'http-status-codes';
import { env } from '@lib/env';

const WHITELIST = ['http://localhost:3000', 'http://localhost:3030'];

export const corsOptions = {
  origin: (
    origin: string | undefined,
    callback: (error: Error | null, allow: boolean) => void
  ) => {
    if (!origin || env.NODE_ENV === 'development') {
      return callback(null, true);
    }

    if (WHITELIST.includes(origin)) {
      return callback(null, true);
    }

    return callback(new Error(`Origin ${origin} not allowed by CORS`), false);
  },
  credentials: true,
  optionsSuccessStatus: StatusCodes.OK,
  method: ['GET', 'POST', 'PUT', 'PATCH', 'DELETE']
};
