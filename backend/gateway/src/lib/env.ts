import { config } from 'dotenv';

config({ path: '.env' });

export const env = {
  NODE_ENV: process.env.NODE_ENV,
  PORT: process.env.PORT || 3000
};
